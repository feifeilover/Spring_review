<%--
  Created by IntelliJ IDEA.
  User: cp
  Date: 2018/11/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>查询列表</title>
  </head>
  <body>
  <form action="search.do" method="get">
      <input type="hidden" name="ttt" value="yes">
        按照姓名查询:<input type="text" value="${name}" name="name"/>
        <button>提交</button>
  </form>

    <fieldset>
      <legend>根据姓名查询</legend>
        <c:if test="${not empty paging.data}">
            <table border="1px" cellpadding="5px" cellspacing="0px">
                <tr>
                    <td>用户ID</td>
                    <td>用户姓名</td>
                    <td>用户性别</td>
                    <td>用户年龄</td>
                </tr>
                <c:forEach items="${paging.data}" var="page">
                    <tr>
                        <td>${page.id}</td>
                        <td>${page.name}</td>
                        <td>${page.gender}</td>
                        <td>${page.age}</td>
                    </tr>
                </c:forEach>

                <tfoot>
                    <tr>
                        <td colspan="4">
                            当前页/总页数${paging.currPage}/${paging.pageCount}
                            总记录数${paging.rowsCount}
                            <c:if test="${paging.currPage>1}">
                                <a href="search.do?p=${paging.currPage-1}">上一页</a>
                            </c:if>
                            <a href="search.do?p=1">第一页</a>
                            <c:forEach begin="1" end="${paging.pageCount}" var="i">
                                <c:if test="${i == paging.currPage}">
                                    ${i}
                                </c:if>

                                <c:if test="${i != paging.currPage}">
                                    <a href="search.do?p=${i}">${i}</a>
                                </c:if>
                            </c:forEach>


                            <c:if test="${paging.currPage<paging.pageCount}">
                                <a href="search.do?p=${paging.currPage+1}">下一页</a>
                            </c:if>
                            <a href="search.do?p=${paging.pageCount}">最后一页</a>
                        </td>
                    </tr>
                </tfoot>
            </table>


        </c:if>



    </fieldset>
  </body>
</html>
