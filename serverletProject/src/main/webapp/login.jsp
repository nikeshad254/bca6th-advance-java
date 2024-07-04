<html>
<head>
    <style>
        body{
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100svh;
        }
        form{
            display: flex;
            gap: 1rem;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        input{
            font-size: 20px;
            padding: 4px;
        }
        button{
            font-size: 20px;
            background: #006f6f;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <form method="post" action="/serverletProject/login">
        <h1>Student Login</h1>
        <input name="username" type="text" placeholder="enter username" />
        <input name="password" type="password" placeholder="enter password" />
        <button>Login</button>
    </form>
</body>
</html>