<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<head>
				<h1>学生列表</h1>
			</head>
			<body>
				<xsl:apply-templates></xsl:apply-templates>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template name="学生" match="/学生列表/*">
		<p><xsl:value-of select="./个人信息/姓名"></xsl:value-of></p>
		<p><xsl:value-of select="./学号"></xsl:value-of></p>
		<table border="1">
			<tr>
				<th>课程编号</th>
				<th>平时成绩</th>
				<th>期末成绩</th>
				<th>总评成绩</th>
			</tr>
			<xsl:for-each select="./所修课程及成绩/所修课程">
				<tr>
					<th><xsl:value-of select="./@课程编号"></xsl:value-of></th>
					
					<xsl:for-each select="./*">
					
						<xsl:if test=".&lt;60">
							<th bgcolor="#ff00ff"><xsl:value-of select="."></xsl:value-of></th>
						</xsl:if>
						
						<xsl:if test=".>=60">
							<th><xsl:value-of select="."></xsl:value-of></th>
						</xsl:if>
						
					</xsl:for-each>
					
				</tr>
			</xsl:for-each>
		</table>
		<hr></hr>
	</xsl:template>
	
</xsl:stylesheet>