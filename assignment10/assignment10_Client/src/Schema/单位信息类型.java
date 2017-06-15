/**
 * 单位信息类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Schema;

public class 单位信息类型  implements java.io.Serializable {
    private java.lang.String 单位部门名;

    private java.lang.String 部门编号;

    private java.lang.String 职务;

    public 单位信息类型() {
    }

    public 单位信息类型(
           java.lang.String 单位部门名,
           java.lang.String 部门编号,
           java.lang.String 职务) {
           this.单位部门名 = 单位部门名;
           this.部门编号 = 部门编号;
           this.职务 = 职务;
    }


    /**
     * Gets the 单位部门名 value for this 单位信息类型.
     * 
     * @return 单位部门名
     */
    public java.lang.String get单位部门名() {
        return 单位部门名;
    }


    /**
     * Sets the 单位部门名 value for this 单位信息类型.
     * 
     * @param 单位部门名
     */
    public void set单位部门名(java.lang.String 单位部门名) {
        this.单位部门名 = 单位部门名;
    }


    /**
     * Gets the 部门编号 value for this 单位信息类型.
     * 
     * @return 部门编号
     */
    public java.lang.String get部门编号() {
        return 部门编号;
    }


    /**
     * Sets the 部门编号 value for this 单位信息类型.
     * 
     * @param 部门编号
     */
    public void set部门编号(java.lang.String 部门编号) {
        this.部门编号 = 部门编号;
    }


    /**
     * Gets the 职务 value for this 单位信息类型.
     * 
     * @return 职务
     */
    public java.lang.String get职务() {
        return 职务;
    }


    /**
     * Sets the 职务 value for this 单位信息类型.
     * 
     * @param 职务
     */
    public void set职务(java.lang.String 职务) {
        this.职务 = 职务;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 单位信息类型)) return false;
        单位信息类型 other = (单位信息类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.单位部门名==null && other.get单位部门名()==null) || 
             (this.单位部门名!=null &&
              this.单位部门名.equals(other.get单位部门名()))) &&
            ((this.部门编号==null && other.get部门编号()==null) || 
             (this.部门编号!=null &&
              this.部门编号.equals(other.get部门编号()))) &&
            ((this.职务==null && other.get职务()==null) || 
             (this.职务!=null &&
              this.职务.equals(other.get职务())));
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
        if (get单位部门名() != null) {
            _hashCode += get单位部门名().hashCode();
        }
        if (get部门编号() != null) {
            _hashCode += get部门编号().hashCode();
        }
        if (get职务() != null) {
            _hashCode += get职务().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(单位信息类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单位信息类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("单位部门名");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单位部门名"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("部门编号");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "部门编号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("职务");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "职务"));
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
