<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" referrerpolicy="no-referrer" />
    <title>JSP - Hello World</title>
</head>
<body>
<jsp:include page="Views/Components/header.jsp"></jsp:include>
<section class="text-gray-600 body-font">
    <div class="container px-5 py-24 mx-auto flex flex-wrap items-center">
        <form action="ClientConnectionServlet" method="post" class="lg:w-1/2 md:w-1/2 shadow-lg shadow-slate-500 rounded-lg p-8 flex justify-center flex-col md:mx-auto w-full mt-10 md:mt-0">
            <h2 class="text-gray-900  text-center text-xl font-bold title-font mb-5">Connexion</h2>
            <div class="relative mb-4">
                <label for="email" class="leading-7 text-sm text-gray-600">email</label>
                <input type="email" id="email" name="email" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
            </div>
            <div class="relative mb-4">
                <label for="password" class="leading-7 text-sm text-gray-600">mot de passe</label>
                <input type="password" id="password" name="pwd" class="w-full bg-white rounded border border-gray-300 focus:border-blue-500 focus:ring-2 focus:ring-blue-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out">
            </div>
            <button type="submit" class="text-white bg-black border-0 py-2 px-8 focus:outline-none hover:bg-slack-700 rounded text-lg">se connecter</button>
        </form>

    </div>
</section>
<jsp:include page="Views/Components/footer.jsp"></jsp:include>
</body>
</html>