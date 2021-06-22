<%-- 
    Document   : datatable
    Created on : Jun 19, 2021, 4:57:20 PM
    Author     : Maneesha Nirman
--%>

<%@page import="Entity.Data"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
       

        <div class="limiter">
            <div class="container-table100">
                <div class="wrap-table100">
                    <div class="table100">
                        <table>
                            <thead>
                                <tr class="table100-head">
                                    <th class="column1">Track ID</th>
                                    <th class="column2">Train</th>
                                    <th class="column3">Location</th>
                                    <th class="column4">Date</th>
                                    <th class="column5">Time</th>
                                    <th class="column6">Temperature</th>
                                    <th class="column7">Speed</th>
                                    <th class="column8">Humidity</th>
                                </tr>
                            </thead>
                            <tbody>
                                
                                <%
List<Data> list=(List<Data>)request.getAttribute("data");
for (Data d : list) {
    
%>    
   
                                <tr>
                                    <td class="column1"><%=d.getTrackId() %></td>
                                    <td class="column2"><%=d.getTrainName() %></td>
                                    <td class="column3"><%=d.getLocation()%></td>
                                    <td class="column4"><%=d.getDate() %></td>
                                    <td class="column5"><%=d.getTime() %></td>
                                    <td class="column6"><%=d.getHuminity() %></td>
                                    <td class="column7"><%=d.getSpeed() %></td>
                                     <td class="column8"><%=d.getHuminity() %></td>
                                </tr>
                                <%}%>

                                 </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

