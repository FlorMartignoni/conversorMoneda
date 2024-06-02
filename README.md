Aplicación de Conversión de Monedas Esta aplicación está diseñada para convertir monedas utilizando tasas de cambio obtenidas de una API externa. 
Desarrollada en Java, proporciona una forma simple y eficiente de obtener las últimas tasas de conversión y realizar conversiones de monedas.

Características

- Obtiene tasas de conversión de monedas en tiempo real desde una API externa.
- Soporta la conversión entre múltiples monedas.
- Utiliza la biblioteca GSON para el análisis de JSON.
- Interfaz fácil de usar para realizar conversiones rápidas de monedas.


Requisitos Para ejecutar esta aplicación, necesitarás:

- Java Development Kit (JDK) 17 o superior
- Conexión a internet para obtener las últimas tasas de conversión desde la API
- La biblioteca GSON
- API Key de ExchangeRate-API


Navegando el Menu podrás realizar las siguientes acciones:

- Ingresar el código de la moneda de origen (por ejemplo, USD).
- Ingresar el código de la moneda de destino (por ejemplo, EUR).
- Ingresar el monto que deseas convertir.
- Calcular la conversión -> La aplicación mostrará la cantidad convertida según la última tasa de cambio.


Integración de la API 

La aplicación utiliza una API externa para obtener tasas de cambio en tiempo real. El endpoint de la API y el proceso de obtención y análisis de los datos se gestionan usando la biblioteca GSON.


Dependencias 
Este proyecto utiliza las siguientes dependencias:

- GSON - Para el análisis de JSON

Contribuciones 
¡Las contribuciones son bienvenidas! No dudes en enviar un pull request o abrir un issue si tienes alguna sugerencia o encuentras algún error.