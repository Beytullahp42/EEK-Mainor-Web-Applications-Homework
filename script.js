let cookie = document.getElementById("cookie");
let cookieCount = document.getElementById("cookie-count");
let cookieCountValue = 0;

cookie.addEventListener("click", async function () {
    cookieCountValue++;
    cookieCount.innerHTML = cookieCountValue.toString();

    if (cookieCountValue % 10 === 0) {
        let toast = Toastify({
            text: "You have clicked the cookie " + cookieCountValue + " times!\nLoading...",
            duration: 99999,
            gravity: "top",
            position: "right",
            backgroundColor: "#4CAF50",
            stopOnFocus: true
        }).showToast();

        // Pass cookieCountValue to getFullMessage
        const message = await getFullMessage(cookieCountValue);

        toast.hideToast();

        Toastify({
            text: message,
            duration: 5000,
            gravity: "top",
            position: "right",
            backgroundColor: "#4CAF50",
            stopOnFocus: true
        }).showToast();
    }
});

// renamed function and added count parameter
async function getFullMessage(count) {
    const startTime = Date.now();
    try {
        const response = await fetch('https://randomuser.me/api');
        const data = await response.json();
        const firstName = data.results[0].name.first;
        const endTime = Date.now();
        const elapsedSeconds = ((endTime - startTime) / 1000).toFixed(2);

        return `You have clicked the cookie ${count} times!\n${firstName} says hi!\nThis took ${elapsedSeconds} seconds to load.`;
    } catch (error) {
        const endTime = Date.now();
        const elapsedSeconds = ((endTime - startTime) / 1000).toFixed(2);
        return `You have clicked the cookie ${count} times!\nSomeone says hi!\nThis took ${elapsedSeconds} seconds to load.\nError fetching name: ${error}`;
    }
}
