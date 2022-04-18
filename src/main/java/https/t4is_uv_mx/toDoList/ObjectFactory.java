//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 04:34:47 PM CDT 
//


package https.t4is_uv_mx.toDoList;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.todolist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarToDoListRequest_QNAME = new QName("https://t4is.uv.mx/toDoList", "BuscarToDoListRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.todolist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarToDoListResponse }
     * 
     */
    public BuscarToDoListResponse createBuscarToDoListResponse() {
        return new BuscarToDoListResponse();
    }

    /**
     * Create an instance of {@link ToDoListRequest }
     * 
     */
    public ToDoListRequest createToDoListRequest() {
        return new ToDoListRequest();
    }

    /**
     * Create an instance of {@link ToDoListResponse }
     * 
     */
    public ToDoListResponse createToDoListResponse() {
        return new ToDoListResponse();
    }

    /**
     * Create an instance of {@link BuscarToDoListResponse.Tareas }
     * 
     */
    public BuscarToDoListResponse.Tareas createBuscarToDoListResponseTareas() {
        return new BuscarToDoListResponse.Tareas();
    }

    /**
     * Create an instance of {@link ModificarToDoListRequest }
     * 
     */
    public ModificarToDoListRequest createModificarToDoListRequest() {
        return new ModificarToDoListRequest();
    }

    /**
     * Create an instance of {@link ModificarToDoListResponse }
     * 
     */
    public ModificarToDoListResponse createModificarToDoListResponse() {
        return new ModificarToDoListResponse();
    }

    /**
     * Create an instance of {@link BorrarToDoListRequest }
     * 
     */
    public BorrarToDoListRequest createBorrarToDoListRequest() {
        return new BorrarToDoListRequest();
    }

    /**
     * Create an instance of {@link BorrarToDoListResponse }
     * 
     */
    public BorrarToDoListResponse createBorrarToDoListResponse() {
        return new BorrarToDoListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/toDoList", name = "BuscarToDoListRequest")
    public JAXBElement<Object> createBuscarToDoListRequest(Object value) {
        return new JAXBElement<Object>(_BuscarToDoListRequest_QNAME, Object.class, null, value);
    }

}
