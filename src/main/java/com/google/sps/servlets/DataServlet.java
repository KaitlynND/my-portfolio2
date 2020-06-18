// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

//import com.google.sps.data.ServerStats;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
//import com.google.sps.data.Task;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
   private final ArrayList<String> jstring = new ArrayList<String>();
   // private final ArrayList<String> tasks = new ArrayList<String>();


    
@Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String text = getParameter(request, "text-input", "");
    response.sendRedirect("/index.html");

    String title = request.getParameter("title");

    Entity taskEntity = new Entity("Task");
    taskEntity.setProperty("title", title);
    

    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.put(taskEntity);

    response.sendRedirect("/index.html");



  }   

    
    private String getParameter(HttpServletRequest request, String name, String defaultValue) {
        String value = request.getParameter(name);
            if (value == null) {
                return defaultValue;
                }
                return value;
                 }




   
   
    /**
   * @return 
   */
 
    

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
 Entity employee = new Entity("Employee", "asalieri");
 employee.setProperty("firstName", "Antonio");
 employee.setProperty("lastName", "Salieri");
// employee.setProperty("hireDate", new Date());
 employee.setProperty("attendedHrTraining", true);

 DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
 datastore.put(employee);
 
    

        
response.setContentType("text/html;");
response.getWriter().println("Hello Kaitlyn!");
}
}



    







  
 /* private String convertToJsonUsingGson(ArrayList<String> jstring) {
      Gson gson = new Gson();
      String json = gson.toJson(jstring);
      return json;*/

        /* jstring.add("Viola");
      jstring.add("Trumpet");
      jstring.add("Cello");


    response.getWriter().println(jstring);*/
  




  
  


