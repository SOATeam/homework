/**
 * 单科成绩类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package schema;

public class 单科成绩类型  implements java.io.Serializable {
    private 课程类型 课程;

    private java.lang.String 平时成绩;

    private java.lang.String 期末成绩;

    private java.lang.String 总评成绩;

    public 单科成绩类型() {
    }

    public 单科成绩类型(
           课程类型 课程,
           java.lang.String 平时成绩,
           java.lang.String 期末成绩,
           java.lang.String 总评成绩) {
           this.课程 = 课程;
           this.平时成绩 = 平时成绩;
           this.期末成绩 = 期末成绩;
           this.总评成绩 = 总评成绩;
    }


    /**
     * Gets the 课程 value for this 单科成绩类型.
     * 
     * @return 课程
     */
    public 课程类型 get课程() {
        return 课程;
    }


    /**
     * Sets the 课程 value for this 单科成绩类型.
     * 
     * @param 课程
     */
    public void set课程(课程类型 课程) {
        this.课程 = 课程;
    }


    /**
     * Gets the 平时成绩 value for this 单科成绩类型.
     * 
     * @return 平时成绩
     */
    public java.lang.String get平时成绩() {
        return 平时成绩;
    }


    /**
     * Sets the 平时成绩 value for this 单科成绩类型.
     * 
     * @param 平时成绩
     */
    public void set平时成绩(java.lang.String 平时成绩) {
        this.平时成绩 = 平时成绩;
    }


    /**
     * Gets the 期末成绩 value for this 单科成绩类型.
     * 
     * @return 期末成绩
     */
    public java.lang.String get期末成绩() {
        return 期末成绩;
    }


    /**
     * Sets the 期末成绩 value for this 单科成绩类型.
     * 
     * @param 期末成绩
     */
    public void set期末成绩(java.lang.String 期末成绩) {
        this.期末成绩 = 期末成绩;
    }


    /**
     * Gets the 总评成绩 value for this 单科成绩类型.
     * 
     * @return 总评成绩
     */
    public java.lang.String get总评成绩() {
        return 总评成绩;
    }


    /**
     * Sets the 总评成绩 value for this 单科成绩类型.
     * 
     * @param 总评成绩
     */
    public void set总评成绩(java.lang.String 总评成绩) {
        this.总评成绩 = 总评成绩;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 单科成绩类型)) return false;
        单科成绩类型 other = (单科成绩类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.课程==null && other.get课程()==null) || 
             (this.课程!=null &&
              this.课程.equals(other.get课程()))) &&
            ((this.平时成绩==null && other.get平时成绩()==null) || 
             (this.平时成绩!=null &&
              this.平时成绩.equals(other.get平时成绩()))) &&
            ((this.期末成绩==null && other.get期末成绩()==null) || 
             (this.期末成绩!=null &&
              this.期末成绩.equals(other.get期末成绩()))) &&
            ((this.总评成绩==null && other.get总评成绩()==null) || 
             (this.总评成绩!=null &&
              this.总评成绩.equals(other.get总评成绩())));
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
        if (get课程() != null) {
            _hashCode += get课程().hashCode();
        }
        if (get平时成绩() != null) {
            _hashCode += get平时成绩().hashCode();
        }
        if (get期末成绩() != null) {
            _hashCode += get期末成绩().hashCode();
        }
        if (get总评成绩() != null) {
            _hashCode += get总评成绩().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(单科成绩类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单科成绩类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("课程");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程类型"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("平时成绩");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "平时成绩"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("期末成绩");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "期末成绩"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("总评成绩");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "总评成绩"));
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
