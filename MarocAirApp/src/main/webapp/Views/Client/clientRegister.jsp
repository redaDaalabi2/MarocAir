<%--
  Created by IntelliJ IDEA.
  User: YC
  Date: 14/10/2022
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" referrerpolicy="no-referrer" />
  <title>Maroc AIR - Regsiter</title>
</head>
<body>

<jsp:include page="../Components/header.jsp"></jsp:include>

<div class="bg-white rounded-lg shadow sm:max-w-md sm:w-full sm:mx-auto sm:overflow-hidden">
  <div class="px-4 py-8 sm:px-10">
    <div class="relative mt-6">
      <div class="absolute inset-0 flex items-center">
        <div class="w-full border-t border-gray-300">
        </div>
      </div>
      <div class="relative flex justify-center text-sm leading-5">
        <span class="px-2 text-gray-500 bg-white">
            Nouveau compte
        </span>
      </div>
    </div>
    <div class="mt-6">
      <form action="" method="POST">
        <div class="w-full space-y-6">
          <div class="w-full">
            <div class=" relative ">
              <input type="text" id="search-form-nom" name="nom" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Nom"/>
            </div>
          </div>
          <div class="w-full">
            <div class=" relative ">
              <input type="text" id="search-form-prenom" name="prenom" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Prenom"/>
            </div>
          </div>
          <div class="w-full">
            <div class=" relative ">
              <input type="text" id="search-form-email" name="email" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Email"/>
            </div>
          </div>
          <div class="w-full">
            <div class=" relative ">
              <input type="text" id="search-form-phone" name="phone" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Telephone"/>
            </div>
          </div>
          <div class="w-full">
            <div class=" relative ">
              <input type="text" id="search-form-password" name="pwd" class=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Mot de passe"/>
            </div>
          </div>
          <div>
              <span class="block w-full rounded-md shadow-sm">
                  <button  type="submit" class="py-2 px-4  bg-indigo-600 hover:bg-indigo-700 focus:ring-indigo-500 focus:ring-offset-indigo-200 text-white w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md focus:outline-none focus:ring-2 focus:ring-offset-2  rounded-lg ">
                      s'inscrire
                  </button>
              </span>
          </div>
        </div>
      </form>
    </div>
  </div>

</div>

</body>
</html>
</body>
</html>

