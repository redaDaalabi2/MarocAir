<%@ page import="DAO.FlightDao" %>
<%@ page import="Models.Flight" %><%--
  Created by IntelliJ IDEA.
  User: Reda
  Date: 18/10/2022
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" referrerpolicy="no-referrer" />
  <title>Edit Vol</title>
</head>
<body>
<%@page import="Models.Flight"%>
<%
  String id = request.getParameter("id");
  Flight f = FlightDao.getRecordById(Integer.parseInt(id));
%>
<jsp:include page="../Components/header_dash.jsp"></jsp:include>
<!-- Edit Vol -->
<div>
  <div class="flex flex-col items-center min-h-screen pt-6 sm:justify-center sm:pt-0 mt-6">
    <div class="w-full px-16 py-10 overflow-hidden bg-gray-100 rounded-lg lg:max-w-4xl">
      <div class="mb-8">
        <h1 class="font-serif text-3xl font-bold text-center decoration-gray-400">
          Edit Vol
        </h1>
      </div>
      <div class="w-full px-6 py-4 bg-white rounded shadow-md ring-gray-900/10">
        <form method="POST" action="">
          <!-- id -->
          <div>
            <input value="<%=f.getId() %>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" type="hidden" name="id" />
          </div>
          <!-- Ville de depart -->
          <div>
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Ville de depart
            </label>
            <input value="<%=f.getVille_depart()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="text" name="ville_depart" />
          </div>
          <!-- Ville d'arrivée -->
          <div class="mt-4">
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Ville d'arrivée
            </label>
            <input value="<%=f.getVille_arrivee()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="text" name="ville_arrivee"/>
          </div>
          <!-- Heure de depart -->
          <div>
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Heure de depart
            </label>
            <input value="<%=f.getHeure_depart()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="time" name="heure_depart"/>
          </div>
          <!-- Heure d'arrivée -->
          <div class="mt-4">
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Heure d'arrivée
            </label>
            <input value="<%=f.getHeure_arrivee()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="time" name="heure_arrivee"/>
          </div>
          <!-- Date de depart -->
          <div>
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Date de depart
            </label>
            <input value="<%=f.getDate_depart()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="date" name="date_depart"/>
          </div>
          <!-- Date d'arrivée -->
          <div class="mt-4">
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Date d'arrivée
            </label>
            <input value="<%=f.getDate_arrivee()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="date" name="date_arrivee"/>
          </div>
          <!-- Nbr de place -->
          <div class="mt-4">
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Nombre de place
            </label>
            <input value="<%=f.getNbre_place()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="number" max="30" name="nbre_place"/>
          </div>
          <!-- Prix -->
          <div class="mt-4">
            <label class="mb-4 block text-sm font-bold text-gray-700">
              Prix
            </label>
            <input value="<%=f.getPrix()%>" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out" required type="number" name="prix"/>
          </div>
          <div class="flex items-center justify-start mt-4 gap-x-2">
            <a href="./UpdateVolServlet" class="text-white bg-blue-500 border-0 py-2 px-8 focus:outline-none hover:bg-blue-600 rounded text-lg">
              Save
            </a>
            <a href="./getAllVolServlet" class="text-white bg-gray-500 border-0 py-2 px-8 focus:outline-none hover:bg-gray-600 rounded text-lg">
              Cancel
            </a>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
<jsp:include page="../Components/footer.jsp"></jsp:include>
</body>
</html>
