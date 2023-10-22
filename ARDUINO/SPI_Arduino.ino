#include <SPI.h>
bool handshakeConfirmation;
bool connection=true;;
void setup() {
    Serial.begin(9600);
    SPI.begin();
    SPI.setClockDivider(SPI_CLOCK_DIV2);
    Serial.println("ENVIANDO HANDSHAKE");
    //digitalWrite(SS, LOW);
    handshake();
    connection=true;
}

void loop() {
    if(handshakeConfirmation){
      int leds = 10;
      int resp=0;
      Serial.print("Enviando mensaje de activación de LED: ");
      Serial.println(leds);
      SPI.beginTransaction(SPISettings(1000000, MSBFIRST, SPI_MODE0));
      resp=SPI.transfer(leds);
      if(resp>15){
        Serial.println("SIN MENSAJE");
        for(int i=0;i<3;i++){
          resp=SPI.transfer(leds);
          if(resp>15 && i==2){
            Serial.print(i+1);
            Serial.println("");
            Serial.println("CONEXION PERDIDA, REINICIE EL SISTEMA");
            connection=false;
            break;
          }
          if(resp>15){
            Serial.print(i+1);
            Serial.print("...");
          }else{
            break;
          }
          delay(1000);
        }
      }else{
        Serial.println(resp);
      }

      if(connection){
        SPI.endTransaction();
      // Esperar 1.5 segundos
      
      }else{
        delay(5000);
        abort();
      }

      delay(1500);
    }

    
}


void handshake(){
  digitalWrite(SS, LOW);
  int respHandshake=0;
  SPI.beginTransaction(SPISettings(1000000, MSBFIRST, SPI_MODE0));
  
  int i=0;
  while (i<3){
    respHandshake=SPI.transfer(5);
    if(respHandshake==0&& i==2){
      Serial.println("HANDSHAKE CONFIRMADO");
      handshakeConfirmation=true;
      digitalWrite(SS, HIGH);
      break;  
    }
    if(respHandshake==0){
      i++;
    }
    if(respHandshake!=0){
      Serial.println("HANDSHAKE FALLIDO");
      handshakeConfirmation=false;
      break;  
    }
    delay(1000);
  }

}





