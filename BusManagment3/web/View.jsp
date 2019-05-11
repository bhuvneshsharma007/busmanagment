<%-- 
    Document   : View
    Created on : Apr 3, 2019, 2:36:43 PM
    Author     : Bhuvnesh Sharma
--%>

<%@page import="Bean.Bus"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="Dao.BusOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <style>
        
    </style>
<body>

<div id="head">

</div>



<div id="wrapper">
  <h1> Routes</h1>
  
  <table id="keywords" cellspacing="0" cellpadding="0">
    <thead>
      <tr>
        <th><span>Driver Name</span></th>
        <th><span>Driver Contact</span></th>
        <th><span>Bus Number</span></th>
        <th><span>Bus Route</span></th>
        <th><span>Timing</span></th>
        <th><span></span></th>
        <th><span></span></th>
      </tr>
    </thead>
     <%
                    BusOperation st = new BusOperation();
                    List li = st.selectAllBus();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Bus bus= (Bus) lit.next();
                %>
                <tr>
                    <td><%=bus.getDriverName()%></td>
                    <td><%=bus.getDriverContact()%></td>
                    <td><%=bus.getBusNo()%></td>
                    <td><%=bus.getBusRoute()%></td>
                    <td><%=bus.getBusTime()%></td>
                
                
                    <td><a href="update.jsp?id=<%=bus.getB_id()%>">UPDATE</a></td>
                    <td><a href="delete.jsp?id=<%=bus.getB_id()%>">DELETE</a></td>
                </tr> 
                <%}%>
    
  </table>
 </div>

 
    


</body>
</html>
