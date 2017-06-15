/**
 * 成绩性质类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package schema;

public class 成绩性质类型 implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    public 成绩性质类型(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _平时成绩 = "平时成绩";
    public static final java.lang.String _作业成绩 = "作业成绩";
    public static final java.lang.String _期中成绩 = "期中成绩";
    public static final java.lang.String _期末成绩 = "期末成绩";
    public static final java.lang.String _总评成绩 = "总评成绩";
    public static final 成绩性质类型 平时成绩 = new 成绩性质类型(_平时成绩);
    public static final 成绩性质类型 作业成绩 = new 成绩性质类型(_作业成绩);
    public static final 成绩性质类型 期中成绩 = new 成绩性质类型(_期中成绩);
    public static final 成绩性质类型 期末成绩 = new 成绩性质类型(_期末成绩);
    public static final 成绩性质类型 总评成绩 = new 成绩性质类型(_总评成绩);
    public java.lang.String getValue() { return _value_;}
    public static 成绩性质类型 fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        成绩性质类型 enumeration = (成绩性质类型)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static 成绩性质类型 fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(成绩性质类型.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "成绩性质类型"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
