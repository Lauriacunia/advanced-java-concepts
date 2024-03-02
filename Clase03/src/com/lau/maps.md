En Java, un Map es una interfaz que representa una colección de <b>pares clave-valor</b>, 
donde cada clave es única y se utiliza para recuperar su valor asociado.
Los Map en Java son parte del marco de colecciones de Java (java.util),
y proporcionan métodos para agregar, eliminar, obtener y buscar elementos en el mapa.
Algunas implementaciones comunes de la interfaz Map en Java incluyen HashMap, TreeMap y LinkedHashMap. 


- HashMap: HashMap es una implementación de la interfaz Map que utiliza una tabla hash para almacenar los pares clave-valor. Los elementos en un HashMap no se almacenan en orden y se pueden acceder mediante una clave. HashMap es muy eficiente para agregar, eliminar y buscar elementos, pero no garantiza un orden específico.

- TreeMap: TreeMap es una implementación de la interfaz Map que utiliza un árbol rojo-negro para almacenar los pares clave-valor. Los elementos en un TreeMap se almacenan en orden natural o en un orden definido por un comparador. TreeMap es muy eficiente para buscar elementos, pero menos eficiente para agregar y eliminar elementos.

- LinkedHashMap: LinkedHashMap es una implementación de la interfaz Map que utiliza una lista doblemente enlazada para almacenar los pares clave-valor. Los elementos en un LinkedHashMap se almacenan en el orden en que se agregaron. LinkedHashMap es muy eficiente para recorrer los elementos en el orden en que se agregaron, pero menos eficiente para buscar elementos.