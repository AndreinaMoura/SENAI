const btntoast = document.getElementById("btntoast");
const toast = document.getElementById("toast");

btntoast.addEventListener('click', () => {
    const seutoast = new bootstrap.Toast(toast)

    seutoast.show();
})