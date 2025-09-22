document.getElementById("registration-form").addEventListener("submit", function(e) {
  e.preventDefault();

  const name = document.getElementById("fname").value.trim();
  const phone = document.getElementById("phone").value.trim();
  const address = document.getElementById("address").value.trim();
  const date = document.getElementById("date").value;
  const course = document.getElementById("course").value.trim();
  const payment = document.getElementById("payment").value.trim();
  const type = document.getElementById("type").value.trim();

  if (!name || !phone || !address || !date || !course || !payment || !type) {
    document.getElementById("msg").innerText = "⚠️ Please fill in all fields.";
    document.getElementById("msg").style.color = "red";
    return;
  }

  if (!/^\d{10}$/.test(phone)) {
    document.getElementById("msg").innerText = "⚠️ Please enter a valid 10-digit phone number.";
    document.getElementById("msg").style.color = "red";
    return;
  }

  let formData = new FormData(this);

  fetch("https://sheetdb.io/api/v1/n0vzzepjp05db", {
    method: "POST",
    body: formData
  })
  .then(response => response.json())
  .then(data => {
    console.log(data);
    document.getElementById("msg").innerText = "✅ Submitted successfully! Thank you, " + name;    

    Object.assign(document.getElementById("msg").style, {
      color: "green",
      fontSize: "20px",
      '@media (max-width: 767px)': { maxWidth: '100%' }
    });
    document.getElementById("registration-form").reset(); 
  })
  .catch(error => {
    console.error(error);
    document.getElementById("msg").innerText = "❌ Something went wrong. Please try again.";
    document.getElementById("msg").style.color = "red";
  });
});
const chatButtons = document.querySelector('.chat-buttons');
toggleBtn.addEventListener('click', () => {
    chatButtons.style.display = (chatButtons.style.display === 'none') ? 'flex' : 'none';
});