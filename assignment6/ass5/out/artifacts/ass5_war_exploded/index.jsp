<%--
  Created by IntelliJ IDEA.
  User: StevenWu
  Date: 17/5/2
  Time: 下午8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SOAP第六次作业</title>
  </head>
  <body>

  <form action="/score/modify" method="post">
      <table>

        <%--<tr>--%>
          <%--<td>学号:<input name="studentid" type="text"></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
          <%--<td>课程编号:<input name="courseid" type="text"></td>--%>
        <%--</tr>--%>
        <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
          <%--&lt;%&ndash;<td>成绩性质:<input name="type" type="text"></td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
        <%--<tr>--%>
          <%--<td>新成绩:<input name="score" type="text"></td>--%>
        <%--</tr>--%>

         <p>将要修改的信息放入request.xml中</p>
        <tr>
          <td><input type="submit" value="修改"></td>
        </tr>
      </table>

  </form>
  </body>
</html>
