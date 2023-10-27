# Enunciados de los puntos

## Teniendo en cuenta la aplicación de PetClinic

### 1. Que recursos web de Azure utilizarían para llevar a producción esa aplicación (Enumere todos los recursos que considere necesarios, la idea es atender personas que se encuentran en Alemania, 10000 Usuarios concurrentes. La aplicación debe estar disponible 24/7 todos los días del año)

### 2. Cuanto sería el presupuesto mensual de los recursos a necesitar.

## Desarrollo

### 1. Enumerar los recursos a usar

>#### 1. Azure App Service: Para alojar la aplicación web.

> #### 2. Azure SQL Database: Para almacenar la información de los usurarios y la aplicación.

> #### 3. Azure Redis Cache: Para mejorar el rendimiento de la aplicación al almacenar en caché los datos comúnmente utilizados.

> #### 4. Azure Logic Apps: Para crear flujos de trabajo automatizados y escalables entre aplicaciones y servicios.

> #### 5. Azure Active Directory (AD): Para la autenticación y autorización de usuarios.

> #### 6. Azure Traffic Manager: Para poder distribuir el tráfico de red de manera óptima a los servicios en regiones globales, mientras se asegura un alto rendimiento y disponibilidad.

> #### 7. Azure Monitor and Application Insights: Para poder monitorear el rendimiento y usa de la aplicación.

> #### 8. Azure Storage: Para almacenar los datos no estructurados como imágenes, videos, archivos de registros, copias de seguridad, etc.

> #### 9. Azure Content Delivery Network (CDN): Para entregar contenido de alta banda ancha y videos a los usuarios finales.

> #### 10. Azure DevOps: Para planificar proyectos más inteligentes, colaborar y entregar más rápido con un conjunto de servicios modernos de desarrollo.

> #### 11. Azure Security Center: Para fortalecer la postura de seguridad y proteger contra amenazas.

> #### 12. Azure Cost Management and Billing: Para realizar un seguimiento y controlar los costos de los recursos de Azure.

### 2. Presupuesto mensual.

> #### El presupuesto mensual seria el siguiente.

> #### 1. Azure App Service: 8 instancias X mes, con un plan de ahorro de 3 años mas una instancias reservadas por 3 años = 1868 USD
> ![Image](https://drive.google.com/uc?id=1fkx39dV6XDCX5OXCNqvN7zccTxtSUzS8)

> #### 2. Azure SQL Database: 440 USD
> ![Image](https://drive.google.com/uc?id=1sMYI83wEncDqGGZAvhg7hSCv2Wf1G1GZ)

> #### 3. Azure Redis Cache: 729 USD
> ![Image](https://drive.google.com/uc?id=1xKi8l3l_iI_0PYeM1V5_NY8zDFW9Exs-)

> #### 4. Azure Logic Apps: 359 USD
> ![Image](https://drive.google.com/uc?id=1pZhFgMYNgveq_Z1pCLA6zNwPXu60cs0x)

> #### 5. Azure Active Directory (AD): 300 USD
> ![Image](https://drive.google.com/uc?id=1RRqKaVNxG8-TXFsv5OycP_InVqdkSku1)

> #### 6. Azure Traffic Manager: 33,74 USD
> ![Image](https://drive.google.com/uc?id=1Zraclz8zQEQXxNf8JcCUlRGNyyM98KnW)

> #### 7. Azure Monitor and Application Insights: 47,53 USD
> ![Image](https://drive.google.com/uc?id=1LArBms2jqOLJXGu9SsMoGHGJjSd1Bw84)

> #### 8. Azure Storage: 196,17 USD 
> ![Image](https://drive.google.com/uc?id=1Inad69or9Ftb6OtmVYow-7xD7x0_ZFaK)

> #### 9. Azure Content Delivery Network (CDN): 343,04 USD
> ![Image](https://drive.google.com/uc?id=1MYSkFFqSle1K0nTrVja8qdXKzSe9zRGh)

> #### 10. Azure DevOps: 965 USD
> ![Image](https://drive.google.com/uc?id=1PZjMsBbuYweEeRAWEUT7nGnmPCLfCVD4)

> #### 11. Azure Security Center: Aquí no nos permite elegir Alemania así que quedara en East US 2 = 200 USD
> ![Image](https://drive.google.com/uc?id=1mV7ORliBNUXuQiX-uQHsUm8vWRTWqHXM)

> #### 12. Azure Cost Management and Billing: Este nos sale de gratis si usamos Azure

> Y el en total por todos estos servicios, tendriamos que **5214,48 USD por mes**, seria lo que nos costaria manter la Aplicación web en pie.
