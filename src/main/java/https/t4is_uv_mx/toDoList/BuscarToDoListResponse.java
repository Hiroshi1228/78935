//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 04:34:47 PM CDT 
//


package https.t4is_uv_mx.toDoList;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tareas" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="tarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tipoT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tareas"
})
@XmlRootElement(name = "BuscarToDoListResponse")
public class BuscarToDoListResponse {

    @XmlElement(required = true)
    protected List<BuscarToDoListResponse.Tareas> tareas;

    /**
     * Gets the value of the tareas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tareas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTareas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarToDoListResponse.Tareas }
     * 
     * 
     */
    public List<BuscarToDoListResponse.Tareas> getTareas() {
        if (tareas == null) {
            tareas = new ArrayList<BuscarToDoListResponse.Tareas>();
        }
        return this.tareas;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="tarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tipoT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "no",
        "tarea",
        "tipoT"
    })
    public static class Tareas {

        protected int no;
        @XmlElement(required = true)
        protected String tarea;
        @XmlElement(required = true)
        protected String tipoT;

        /**
         * Obtiene el valor de la propiedad no.
         * 
         */
        public int getNo() {
            return no;
        }

        /**
         * Define el valor de la propiedad no.
         * 
         */
        public void setNo(int value) {
            this.no = value;
        }

        /**
         * Obtiene el valor de la propiedad tarea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarea() {
            return tarea;
        }

        /**
         * Define el valor de la propiedad tarea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarea(String value) {
            this.tarea = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoT.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoT() {
            return tipoT;
        }

        /**
         * Define el valor de la propiedad tipoT.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoT(String value) {
            this.tipoT = value;
        }

    }

}
