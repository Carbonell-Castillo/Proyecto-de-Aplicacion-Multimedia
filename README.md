# Proyecto de Aplicación Multimedia

Este proyecto de aplicación multimedia se centra en el desarrollo de una aplicación con diversas funcionalidades relacionadas con la manipulación de imágenes. La aplicación está diseñada para proporcionar una experiencia intuitiva y eficiente a los usuarios, permitiéndoles organizar su biblioteca de imágenes, realizar ediciones y conversiones.

## Vistas de la Aplicación

### 1. Ventana Principal

La ventana principal sirve como menú principal y ofrece acceso a las secciones de la biblioteca, el editor y el convertidor. Los usuarios pueden cambiar el foco de la aplicación hacia la vista de la función a la que desean acceder. La distribución de menús y componentes específicos de cada funcionalidad queda a discreción del usuario.

### 2. Biblioteca

El área de la biblioteca permite a los usuarios almacenar fotografías organizadas por categoría y usuario. Se solicita un nombre de usuario al iniciar la aplicación, y si el usuario no existe, se crea uno automáticamente. Las categorías son específicas para cada usuario, y al principio, solo se tiene una categoría llamada "General".

#### Funcionalidades de la Biblioteca:

- **Agregar Imagen:** Permite agregar una o varias imágenes a la vez.
- **Eliminar Imagen:** Elimina una imagen seleccionada.
- **Agregar Categoría:** Añade una nueva categoría personalizada.
- **Eliminar Categoría:** Elimina una categoría existente.
- **Siguiente Imagen:** Cambia a la siguiente imagen en la categoría.
- **Imagen Anterior:** Regresa a la imagen anterior en la categoría.

### 3. Editor

El módulo de edición puede cargar imágenes en formato .jpg y realizar diversas operaciones según la elección del usuario. Cuenta con un sistema de carpetas para organizar las imágenes resultantes.

#### Interfaz Gráfica del Editor

#### A. JPEG a BMP y Viceversa

Esta tarea permite leer una imagen en formato JPEG y convertirla a BMP, y viceversa. Se utiliza la clase `ImageIO` y `BufferedImage` en Java para realizar esta conversión.

#### B. Copia – JPEG

Permite leer una imagen JPEG, convertirla a BMP, crear una copia exacta y convertirla nuevamente a JPEG. Se utiliza la clase `BMPHandlerCopy` proporcionada en el material del proyecto.

#### C. Rojo - Verde - Azul - Sepia

Separa la imagen original en tres tonos: rojo, verde y azul. Además, genera una versión sepia de la imagen.

#### D. Modificar Imagen

Genera imágenes adicionales a partir de la imagen original, como una rotación de 180 grados horizontal y vertical.

#### E. Blanco y Negro

Convierte la imagen a blanco y negro.

### 4. Convertidor (Procesamiento por Lotes)

Esta sección implementa el procesamiento por lotes de las funciones anteriores. Los usuarios pueden seleccionar un usuario, una categoría y agregar imágenes a la cola de procesamiento. Se pueden procesar lotes en paralelo, y se proporciona una barra de progreso y una consola de ejecución.

## Almacenamiento

El programa es capaz de guardar y cargar información automáticamente al abrir y cerrar la aplicación. Se utilizan estructuras de datos específicas para el almacenamiento, heredando de la clase abstracta `EstructuraDeDatos` e implementando los métodos necesarios.

### Biblioteca:

- **Almacenamiento Usuarios:** Lista Simple
- **Almacenamiento Categorías:** LinkedList o ArrayList de Java
- **Almacenamiento Imágenes en Categorías:** Lista Circular Doblemente Enlazada

Este proyecto proporciona una experiencia completa para gestionar y manipular bibliotecas de imágenes, ofreciendo a los usuarios una amplia gama de funcionalidades y opciones de edición.