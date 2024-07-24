<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Cookie Manager</h1>

    <form method="post" action="/serverletProject/cookie">
        <div>
            <label for="cookieName">Cookie Name:</label>
            <input type="text" name="cookieName" id="cookieName" />
        </div>

        <div>
            <label for="cookieValue">Cookie Value:</label>
            <input type="text" name="cookieValue" id="cookieValue" />
        </div>

        <button>Set Cookie</button>
    </form>


    <a href="/serverletProject/cookie">
        Get All Cookies
    </a>

</body>
</html>
