/**
 * 删除成绩类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package schema;

public class 删除成绩类型  implements java.io.Serializable {
    private java.lang.String 学号;  // attribute

    private java.lang.String 课程编号;  // attribute

    private 成绩性质类型 成绩性质;  // attribute

    public 删除成绩类型() {
    }

    public 删除成绩类型(
           java.lang.String 学号,
           java.lang.String 课程编号,
           成绩性质类型 成绩性质) {
           this.学号 = 学号;
           this.课程编号 = 课程编号;
           this.成绩性质 = 成绩性质;
    }


    /**
     * Gets the 学号 value for this 删除成绩类型.
     * 
     * @return 学号
     */
    public java.lang.String get学号() {
        return 学号;
    }


    /**
     * Sets the 学号 value for this 删除成绩类型.
     * 
     * @param 学号
     */
    public void set学号(java.lang.String 学号) {
        this.学号 = 学号;
    }


    /**
     * Gets the 课程编号 value for this 删除成绩类型.
     * 
     * @return 课程编号
     */
    public java.lang.String get课程编号() {
        return 课程编号;
    }


    /**
     * Sets the 课程编号 value for this 删除成绩类型.
     * 
     * @param 课程编号
     */
    public void set课程编号(java.lang.String 课程编号) {
        this.课程编号 = 课程编号;
    }


    /**
     * Gets the 成绩性质 value for this 删除成绩类型.
     * 
     * @return 成绩性质
     */
    public 成绩性质类型 get成绩性质() {
        return 成绩性质;
    }


    /**
     * Sets the 成绩性质 value for this 删除成绩类型.
     * 
     * @param 成绩性质
     */
    public void set成绩性质(成绩性质类型 成绩性质) {
        this.成绩性质 = 成绩性质;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 删除成绩类型)) return false;
        删除成绩类型 other = (删除成绩类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.学号==null && other.get学号()==null) || 
             (this.学号!=null &&
              this.学号.equals(other.get学号()))) &&
            ((this.课程编号==null && other.get课程编号()==null) || 
             (this.课程编号!=null &&
              this.课程编号.equals(other.get课程编号()))) &&
            ((this.成绩性质==null && other.get成绩性质()==null) || 
             (this.成绩性质!=null &&
              this.成绩性质.equals(other.get成绩性质())));
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
        if (get学号() != null) {
            _hashCode += get学号().hashCode();
        }
        if (get课程编号() != null) {
            _hashCode += get课程编号().hashCode();
        }
        if (get成绩性质() != null) {
            _hashCode += get成绩性质().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(删除成绩类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "删除成绩类型"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("学号");
        attrField.setXmlName(new javax.xml.namespace.QName("", "学号"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号类型"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("课程编号");
        attrField.setXmlName(new javax.xml.namespace.QName("", "课程编号"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程编号类型"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("成绩性质");
        attrField.setXmlName(new javax.xml.namespace.QName("", "成绩性质"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "成绩性质类型"));
        typeDesc.addFieldDesc(attrField);
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
