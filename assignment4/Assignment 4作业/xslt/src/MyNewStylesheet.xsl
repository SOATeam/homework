<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:jw="http://jw.nju.edu.cn/schema"
	xmlns:www="http://www.nju.edu.cn/schema">

	<xsl:output method="xml" encoding="utf-8" />

	<xsl:template match="/">
		<xsl:element name="课程成绩列表">
			<xsl:element name="课程成绩">
				<xsl:attribute name="课程编号">123456</xsl:attribute>
				<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123456']/jw:平时成绩">
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
				<xsl:attribute name="课程编号">123456</xsl:attribute>
				<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123456']/jw:期末成绩">
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
				<xsl:attribute name="课程编号">123456</xsl:attribute>
				<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123456']/jw:总评成绩">
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
				<xsl:attribute name="课程编号">123457</xsl:attribute>
				<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123457']/jw:平时成绩">
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
				<xsl:attribute name="课程编号">123457</xsl:attribute>
				<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123457']/jw:期末成绩">
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
				<xsl:attribute name="课程编号">123457</xsl:attribute>
				<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123457']/jw:总评成绩">
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
				<xsl:attribute name="课程编号">123458</xsl:attribute>
				<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123458']/jw:平时成绩">
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
				<xsl:attribute name="课程编号">123458</xsl:attribute>
				<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123458']/jw:期末成绩">
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
				<xsl:attribute name="课程编号">123458</xsl:attribute>
				<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123458']/jw:总评成绩">
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
				<xsl:attribute name="课程编号">123459</xsl:attribute>
				<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123459']/jw:平时成绩">
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
				<xsl:attribute name="课程编号">123459</xsl:attribute>
				<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123459']/jw:期末成绩">
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
				<xsl:attribute name="课程编号">123459</xsl:attribute>
				<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123459']/jw:总评成绩">
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
				<xsl:attribute name="课程编号">123450</xsl:attribute>
				<xsl:attribute name="成绩性质">平时成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123450']/jw:平时成绩">
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
				<xsl:attribute name="课程编号">123450</xsl:attribute>
				<xsl:attribute name="成绩性质">期末成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123450']/jw:期末成绩">
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
				<xsl:attribute name="课程编号">123450</xsl:attribute>
				<xsl:attribute name="成绩性质">总评成绩</xsl:attribute>
				<xsl:for-each select="//jw:所修课程[@课程编号='123450']/jw:总评成绩">
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
			
			
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>
