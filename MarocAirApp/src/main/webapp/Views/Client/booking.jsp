<%--
  Created by IntelliJ IDEA.
  User: YC
  Date: 15/10/2022
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <title>Maroc AIR - Booking</title>
</head>
<body>
 <jsp:include page="../Components/header.jsp"></jsp:include>
 <section class="text-gray-600 body-font relative">
     <div class="container px-5 py-10 mx-auto">

         <div class="flex flex-col text-center w-full mb-4">
             <h1 class="sm:text-3xl text-2xl font-bold title-font  text-gray-900">Trouvez un billet d’avion </h1>
         </div>
         <form action="../../VolServlet" method="post">
         <div  class="lg:w-1/2 md:w-2/3 p-6 rounded mx-auto shadow-lg shadow-slate-400">
             <div class="flex flex-wrap -m-2">

                 <div class="p-2 w-1/2">
                     <div class="relative">
                         <label for="name" class="leading-7 text-sm text-gray-600">De...</label>
                         <input type="text" id="name" name="ville_depart" class="w-full bg-gray-100 bg-opacity-50 rounded border border-gray-300 focus:border-blue-500 focus:bg-white focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
                     </div>
                 </div>
                 <div class="p-2 w-1/2">
                     <div class="relative">
                         <label for="text" class="leading-7 text-sm text-gray-600">A...</label>
                         <input type="text" id="text" name="ville_arrivee" class="w-full bg-gray-100 bg-opacity-50 rounded border border-gray-300 focus:border-blue-500 focus:bg-white focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
                     </div>
                 </div>
                 <div class="p-2 w-1/2">
                     <div class="relative">
                         <label for="date_de_deppart" class="leading-7 text-sm text-gray-600">Date de depart</label>
                         <input type="date" id="date_de_deppart" name="date_de_deppart" class="w-full bg-gray-100 bg-opacity-50 rounded border border-gray-300 focus:border-blue-500 focus:bg-white focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
                     </div>
                 </div>
                 <div class="p-2 w-1/2">
                     <div class="relative">
                         <label for="date_arrivee" class="leading-7 text-sm text-gray-600">Date d'arrivée</label>
                         <input type="date" id="date_arrivee" name="date_arrivee" class="w-full bg-gray-100 bg-opacity-50 rounded border border-gray-300 focus:border-blue-500 focus:bg-white focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
                     </div>
                 </div>
                 <div class="p-2 w-1/2">
                     <div class="relative">
                         <label for="nbre_place" class="leading-7 text-sm text-gray-600">Nombre de place</label>
                         <input type="number" min="1" id="nbre_place" name="nbre_place" class="w-full bg-gray-100 bg-opacity-50 rounded border border-gray-300 focus:border-blue-500 focus:bg-white focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
                     </div>
                 </div>

                 <div class="p-2 w-full">
                     <button  class="flex mx-auto bg-black  text-white border-0 py-2 px-8 focus:outline-none hover:bg-blue-600 rounded text-lg">Rechercher</button>
                 </div>
             </div>
         </div>
         </form>

     </div>
 </section>

<c:if test="${data != NULL}">
    <section class="text-gray-600 body-font overflow-hidden">
        <div class="container px-5 py-24 mx-auto">
            <div class="flex flex-col text-center w-full mb-4">
                <h1 class="sm:text-4xl text-3xl font-bold title-font mb-2 text-gray-900">Vols valables</h1>

            </div>
            <div class="flex flex-wrap -m-4">
      <c:forEach var="vol" items="${data}">
                <div class="p-4 xl:w-1/3 md:w-1/2 w-full">
                    <div class="h-full p-6 rounded-lg shadow-slate-400 shadow-lg flex flex-col relative overflow-hidden">
                        <h2 class="text-sm tracking-widest title-font mb-1 font-medium">PRIX</h2>
                        <h1 class="text-5xl text-gray-900 leading-none flex items-center pb-4 mb-4 border-b border-gray-200">
                            <span>${vol.prix} <span class="text-lg ml-1 font-normal text-gray-500">MAD</span></span>
                        </h1>
                        <div class="flex gap-4">
                            <p class="flex items-center text-gray-600 mb-2">
            <span class="w-4 h-4 mr-2 inline-flex items-center justify-center text-white rounded-full flex-shrink-0">
              <i class="fa-solid text-blue-500 fa-location-dot"></i>
            </span>${vol.ville_depart}
                            </p>
                            <p class="flex items-center text-gray-600 mb-2">
                                <i class="fa-solid fa-plane"></i>
                            </p>
                            <p class="flex items-center text-gray-600 mb-2">
            <span class="w-4 h-4 mr-2 inline-flex items-center justify-center  text-white rounded-full flex-shrink-0">
              <i class="fa-solid text-blue-500 fa-location-dot"></i>
            </span>${vol.ville_arrivee}
                            </p>
                        </div>

                        <p class="flex gap-4 items-center text-gray-600 mb-2">
            <span class="w-4 h-4 mr-2 inline-flex items-center bg-slate-300 justify-center  text-white rounded-full flex-shrink-0">
              <i class="fa-solid fa-calendar text-black"></i>
            </span>
                            <span>${vol.date_depart}</span>
                            <span>10:00:00</span>
                        </p>
                        <form action="ReservationServlet" method="post">
                            <input type="hidden" name="code" value="${vol.flightid}">
                        <button type="submit"  class="flex items-center mt-auto text-white bg-gray-400 border-0 py-2 px-4 w-full focus:outline-none hover:bg-gray-500 rounded">
                            Choisir l'offre
                            <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-4 h-4 ml-auto" viewBox="0 0 24 24">
                                <path d="M5 12h14M12 5l7 7-7 7"></path>
                            </svg>
                        </button>
                        </form>
                    </div>
                </div>
      </c:forEach>
            </div>
        </div>
    </section>
</c:if>
 <jsp:include page="../Components/footer.jsp"></jsp:include>
</body>
</html>
