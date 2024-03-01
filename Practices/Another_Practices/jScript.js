document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("loginForm");

    loginForm.addEventListener("submit", function(event) {
        event.preventDefault();

        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        // You can add additional client-side validation if needed

        // Send data to server using AJAX or Fetch API
        // Example:
        // fetch("login.php", {
        //     method: "POST",
        //     body: JSON.stringify({ username, password }),
        //     headers: {
        //         "Content-Type": "application/json"
        //     }
        // })
        // .then(response => response.json())
        // .then(data => {
        //     console.log(data);
        // });
    });
});
