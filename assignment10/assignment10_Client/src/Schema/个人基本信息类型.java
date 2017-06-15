/**
 * 个人基本信息类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Schema;

public class 个人基本信息类型  implements java.io.Serializable {
    private java.lang.String 姓名;

    private java.lang.String 学号;

    private 单位信息类型 单位信息;

    public 个人基本信息类型() {
    }

    public 个人基本信息类型(
           java.lang.String 姓名,
           java.lang.String 学号,
           单位信息类型 单位信息) {
           this.姓名 = 姓名;
           this.学号 = 学号;
           this.单位信息 = 单位信息;
    }


    /**
     * Gets the 姓名 value for this 个人基本信息类型.
     * 
     * @return 姓名
     */
    public java.lang.String get姓名() {
        return 姓名;
    }


    /**
     * Sets the 姓名 value for this 个人基本信息类型.
     * 
     * @param 姓名
     */
    public void set姓名(java.lang.String 姓名) {
        this.姓名 = 姓名;
    }


    /**
     * Gets the 学号 value for this 个人基本信息类型.
     * 
     * @return 学号
     */
    public java.lang.String get学号() {
        return 学号;
    }


    /**
     * Sets the 学号 value for this 个人基本信息类型.
     * 
     * @param 学号
     */
    public void set学号(java.lang.String 学号) {
        this.学号 = 学号;
    }


    /**
     * Gets the 单位信息 value for this 个人基本信息类型.
     * 
     * @return 单位信息
     */
    public 单位信息类型 get单位信息() {
        return 单位信息;
    }


    /**
     * Sets the 单位信息 value for this 个人基本信息类型.
     * 
     * @param 单位信息
     */
    public void set单位信息(单位信息类型 单位信息) {
        this.单位信息 = 单位信息;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 个人基本信息类型)) return false;
        个人基本信息类型 other = (个人基本信息类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.姓名==null && other.get姓名()==null) || 
             (this.姓名!=null &&
              this.姓名.equals(other.get姓名()))) &&
            ((this.学号==null && other.get学号()==null) || 
             (this.学号!=null &&
              this.学号.equals(other.get学号()))) &&
            ((this.单位信息==null && other.get单位信息()==null) || 
             (this.单位信息!=null &&
              this.单位信息.equals(other.get单位信息())));
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
        if (get姓名() != null) {
            _hashCode += get姓名().hashCode();
        }
        if (get学号() != null) {
            _hashCode += get学号().hashCode();
        }
        if (get单位信息() != null) {
            _hashCode += get单位信息().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(个人基本信息类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "个人基本信息类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("姓名");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "姓名"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("学号");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("单位信息");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单位信息"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单位信息类型"));
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
