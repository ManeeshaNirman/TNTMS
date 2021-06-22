function Login() {
    alert("IN");
    var un = document.getElementById("username").value;
    var pw = document.getElementById("pass").value;

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {

        if (request.readyState === 4) {

            if (request.status === 200) {

                var response = request.responseText;
                if (response === "ok") {
                    alert(response);
                    window.location.href = 'loadData.jsp';
                } else {

                    alert("unsucess");
                }

            }

        }

    };
    alert(un + "," + pw);
    var parameter = "un=" + un + "&" + "pw=" + pw;
    request.open("Post", "Login", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send(parameter);
}
function loadData() {

    alert("enawaaa");
    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {

        if (request.readyState === 4) {

            if (request.status === 200) {

                var response = request.responseText;
                alert(response);
                document.getElementById("main").innerHTML = response;


            }

        }

    };
    request.open("GET", "LoadData", true);
    request.send();
}