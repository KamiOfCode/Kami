<%-- 
    Document   : search
    Created on : Oct 5, 2023, 7:17:49 AM
    Author     : ba-vuong
--%>

<%@page import="vuongnb.registration.RegistrationDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1>Search Page</h1>
        <form action="DispatchServlet">
            Search value <input type="text" name="txtSearchValue" 
                                value="<%= request.getParameter("txtSearchValue") %>"/>
            <input type="submit" value="Search" name="btAction" />
        </form><br/>
        <% 
            String searchValue = request.getParameter("txtSearchValue");
            if(searchValue != null){// first time luon luon null
                List<RegistrationDTO> result = (List<RegistrationDTO>) request.getAttribute("SEARCH_RESULT");
                // render
                if(result != null){// has one more records
                    %>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No.</th>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Last name</th>
                                <th>Role</th>
                                <th>Delete</th>
                                <th>Update</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                                int count = 0;
                                for(RegistrationDTO dto: result){
                                    String urlReriwriting = "DispatchServlet?btAction=Delete&pk=" + dto.getUsername() + "&lastSearchValue=" + searchValue;
                                    %>
                        <form action="DispatchServlet" method="POST">
                                    <tr>
                                        <td>
                                            <%= ++count %>
                                        </td>
                                        <td>
                                            <%= dto.getUsername() %>
                                            <input type="hidden" name="txtUsername" value="<%= dto.getUsername() %>" />
                                        </td>
                                        <td>
                                            <input type="text" name="txtPassword" value="<%= dto.getPassword() %>" />
                                        </td>
                                        <td>
                                            <%= dto.getFullname() %>
                                        </td>
                                        <td>
                                            <input type="checkbox" name="chkRole" value="ON" 
                                                   <%
                                                   if(dto.isRole()){
                                                       %>
                                                       checked="checked"
                                                   <%
                                                   }
                                                   %>
                                                   />
                                        </td>
                                        <td>
                                            <a href="<%= urlReriwriting %>">Delete</a>
                                        </td>
                                        <td>
                                            <input type="hidden" name="txtSearchValue" value="<%= searchValue %>" />
                                            <input type="submit" value="Update" name="btAction" />
                                        </td>
                                    </tr>
                        </form>
                                    
                            <%
                                }// end traverse DTO
                            %>
                        </tbody>
                    </table>

        <%
                }else {// no records
                    // code phan manh html
                    %>
                    <h2>
                        No record is matched!!!
                    </h2>
        <%
                }
            }// end search value has invalid value
        %>
    </body>
</html>
