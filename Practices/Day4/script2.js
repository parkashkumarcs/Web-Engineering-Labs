const products = [
    {
      name: "Scooter",
      price: 199.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Scooter",
    },
    {
      name: "Headphones",
      price: 99.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Headphones",
    },
    {
      name: "Smartphone",
      price: 599.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Smartphone",
    },
    {
      name: "Laptop",
      price: 999.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Laptop",
    },
    {
      name: "Watch",
      price: 149.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Watch",
    },
    {
      name: "Sunglasses",
      price: 49.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Sunglasses",
    },
    {
      name: "Backpack",
      price: 79.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Backpack",
    },
    {
   name: "Gaming Console",
      price: 399.99,
      imageUrl: "https://api.dicebear.com/8.x/icons/svg?seed=Gaming%20Console",
    },
  ];
  const container = document.getElementById("container");
  products.forEach((product) => {
    const productDiv = document.createElement("div");
    productDiv.classList.add("product");// productDiv.className = "product"
  
    const imageContainer = document.createElement("div");
    imageContainer.classList.add("image-container");
  
    const image = document.createElement("img");
    image.src = product.imageUrl;
    image.alt = product.name;
    image.classList.add("product-image");
  
    imageContainer.appendChild(image);
  
    const infoDiv = document.createElement("div");
    infoDiv.classList.add("info");
  
    const name = document.createElement("h2");
    name.textContent = product.name;
  
    const price = document.createElement("p");
    price.textContent = "$" + product.price.toFixed(2);
  
    const button = document.createElement("button");
    button.textContent = "Add to Cart";
    button.classList.add("add-to-cart-btn");
  
    infoDiv.appendChild(name);
    infoDiv.appendChild(price);
    infoDiv.appendChild(button);
  
    productDiv.appendChild(imageContainer);
    productDiv.appendChild(infoDiv);
  
    container.appendChild(productDiv);
  
    button.onclick = addCart;
  });
  
  function addCart(event) {
    const cartDiv = document.getElementById("cart");
    const productDiv = event.target.parentElement.parentElement;
    const productName = productDiv.querySelector("h2").textContent;
    const productPrice = productDiv.querySelector("p").textContent;
  
    const cartItem = document.createElement("div");
    cartItem.className = "cart";
    const cartItemName = document.createElement("p");
    const cartItemPrice = document.createElement("p");
    const btn = document.createElement("button");
    btn.className = "rmcart";
    btn.textContent = "Remove from cart";
  
    cartItemName.textContent = productName; // Set text content of product name
    cartItemPrice.textContent = productPrice; // Set text content of product price
  
    cartItem.appendChild(cartItemName); // Append product name to cart item
    cartItem.appendChild(cartItemPrice);
    cartItem.appendChild(btn);
  
    cartDiv.appendChild(cartItem);
  
    btn.onclick = removeCart;
  
    function removeCart(event) {
      const items = event.target.parentElement;
      items.remove();
    }
  }