<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:jw="http://jw.nju.edu.cn/schema"
	xmlns:www="http://www.nju.edu.cn/schema">

	<xsl:output method="xml" encoding="utf-8" />


	<xsl:template name="func" xmlns="http://jw.nju.edu.cn/schema">
	
		<xsl:param name="courseID"/>
		
		<xsl:element name="课程成绩">
			<xsl:attribute name="课程编号"><xsl:value-of select="$courseID"/></xsl:attribute>
			<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
			
			<xsl:for-each select="//jw:所修课程[@课程编号=$courseID]/jw:平时成绩">
				<xsl:sort select="." data-type="number" order="descending" />
		
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="../../../jw:学号" />
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="." />
					</xsl:element>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
		
		<xsl:element name="课程成绩">
			<xsl:attribute name="课程编号"><xsl:value-of select="$courseID"/></xsl:attribute>
			<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
			
			<xsl:for-each select="//jw:所修课程[@课程编号=$courseID]/jw:期末成绩">
				<xsl:sort select="." data-type="number" order="descending" />
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="../../../jw:学号" />
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="." />
					</xsl:element>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
		
		<xsl:element name="课程成绩">
			<xsl:attribute name="课程编号"><xsl:value-of select="$courseID"/></xsl:attribute>
			<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
			
			<xsl:for-each select="//jw:所修课程[@课程编号=$courseID]/jw:总评成绩">
				<xsl:sort select="." data-type="number" order="descending" />
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="../../../jw:学号" />
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="." />
					</xsl:element>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
	
	</xsl:template>
	
	
	
	<xsl:template match="/" xmlns="http://jw.nju.edu.cn/schema">
		<xsl:element name="课程成绩列表">
			<xsl:call-template name="func">
				<xsl:with-param name="courseID">123456</xsl:with-param>
			</xsl:call-template>
			
			<xsl:call-template name="func">
				<xsl:with-param name="courseID">123457</xsl:with-param>
			</xsl:call-template>
			
			<xsl:call-template name="func">
				<xsl:with-param name="courseID">123458</xsl:with-param>
			</xsl:call-template>
			
			<xsl:call-template name="func">
				<xsl:with-param name="courseID">123459</xsl:with-param>
			</xsl:call-template>
			
			<xsl:call-template name="func">
				<xsl:with-param name="courseID">123450</xsl:with-param>
			</xsl:call-template>
			
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>
