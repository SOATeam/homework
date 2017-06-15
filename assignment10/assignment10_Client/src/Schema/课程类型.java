/**
 * 课程类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Schema;

public class 课程类型  implements java.io.Serializable {
    private java.lang.String 课程编号;

    private java.lang.String 课程讲师;

    public 课程类型() {
    }

    public 课程类型(
           java.lang.String 课程编号,
           java.lang.String 课程讲师) {
           this.课程编号 = 课程编号;
           this.课程讲师 = 课程讲师;
    }


    /**
     * Gets the 课程编号 value for this 课程类型.
     * 
     * @return 课程编号
     */
    public java.lang.String get课程编号() {
        return 课程编号;
    }


    /**
     * Sets the 课程编号 value for this 课程类型.
     * 
     * @param 课程编号
     */
    public void set课程编号(java.lang.String 课程编号) {
        this.课程编号 = 课程编号;
    }


    /**
     * Gets the 课程讲师 value for this 课程类型.
     * 
     * @return 课程讲师
     */
    public java.lang.String get课程讲师() {
        return 课程讲师;
    }


    /**
     * Sets the 课程讲师 value for this 课程类型.
     * 
     * @param 课程讲师
     */
    public void set课程讲师(java.lang.String 课程讲师) {
        this.课程讲师 = 课程讲师;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 课程类型)) return false;
        课程类型 other = (课程类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.课程编号==null && other.get课程编号()==null) || 
             (this.课程编号!=null &&
              this.课程编号.equals(other.get课程编号()))) &&
            ((this.课程讲师==null && other.get课程讲师()==null) || 
             (this.课程讲师!=null &&
              this.课程讲师.equals(other.get课程讲师())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get课程编号() != null) {
            _hashCode += get课程编号().hashCode();
        }
        if (get课程讲师() != null) {
            _hashCode += get课程讲师().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(课程类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("课程编号");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程编号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("课程讲师");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程讲师"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
