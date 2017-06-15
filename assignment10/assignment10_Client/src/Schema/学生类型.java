/**
 * 学生类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Schema;

public class 学生类型  implements java.io.Serializable {
    private 个人基本信息类型 个人基本信息;

    private 个人成绩类型 个人成绩;

    public 学生类型() {
    }

    public 学生类型(
           个人基本信息类型 个人基本信息,
           个人成绩类型 个人成绩) {
           this.个人基本信息 = 个人基本信息;
           this.个人成绩 = 个人成绩;
    }


    /**
     * Gets the 个人基本信息 value for this 学生类型.
     * 
     * @return 个人基本信息
     */
    public 个人基本信息类型 get个人基本信息() {
        return 个人基本信息;
    }


    /**
     * Sets the 个人基本信息 value for this 学生类型.
     * 
     * @param 个人基本信息
     */
    public void set个人基本信息(个人基本信息类型 个人基本信息) {
        this.个人基本信息 = 个人基本信息;
    }


    /**
     * Gets the 个人成绩 value for this 学生类型.
     * 
     * @return 个人成绩
     */
    public 个人成绩类型 get个人成绩() {
        return 个人成绩;
    }


    /**
     * Sets the 个人成绩 value for this 学生类型.
     * 
     * @param 个人成绩
     */
    public void set个人成绩(个人成绩类型 个人成绩) {
        this.个人成绩 = 个人成绩;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 学生类型)) return false;
        学生类型 other = (学生类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.个人基本信息==null && other.get个人基本信息()==null) || 
             (this.个人基本信息!=null &&
              this.个人基本信息.equals(other.get个人基本信息()))) &&
            ((this.个人成绩==null && other.get个人成绩()==null) || 
             (this.个人成绩!=null &&
              this.个人成绩.equals(other.get个人成绩())));
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
        if (get个人基本信息() != null) {
            _hashCode += get个人基本信息().hashCode();
        }
        if (get个人成绩() != null) {
            _hashCode += get个人成绩().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(学生类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学生类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("个人基本信息");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "个人基本信息"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "个人基本信息类型"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("个人成绩");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "个人成绩"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "个人成绩类型"));
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
