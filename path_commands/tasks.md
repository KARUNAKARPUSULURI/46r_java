TASK 1: Folder Structure Creation
Create a main folder named MyProject.
Inside MyProject, create three subfolders: src, assets, and docs.
Inside the assets folder, create two more folders named images and videos.
---------------------------------------------------------------------------------------------

TASK 2: Navigating Between Folders
Navigate into the images folder inside assets.
From the images folder, move to the videos folder using relative path.
Go back to the MyProject folder from the videos folder.
--------------------------------------------------------------------------------------------

TASK 3: File Creation and Listing
Navigate to the docs folder.
Create three files: README.txt, design.docx, and requirements.txt.
List all the files present inside the docs folder.
---------------------------------------------------------------------------------------------

TASK 4: Deletion Operations
Delete the file named requirements.txt from the docs folder.
Delete the entire videos folder inside assets.
---------------------------------------------------------------------------------------------

TASK 5: Final Cleanup
Move to the parent directory of MyProject.
Delete the entire MyProject folder and all of its contents.
Clear the terminal screen.



Hello,
This is Karunakar Pusuluri from 10000Coders. Thank you for attending today’s demo session – I hope you found it exciting and informative!
As discussed, I’ve shared the code we worked on today below. Please follow these steps:
1. Copy the code provided at the end of this email.
2. Open Notepad (or any text editor) and paste the code.
3. Save the file as yourname.html (for example: rahul.html)
4. Go to the folder where you saved the file and double-click on it to view the output in your browser.
5. Record a short screen video of the output with your voice or a small caption.
6. Post it on LinkedIn with a short message like:
"I attended a demo session today and learned the basics of web development. Here’s what I created!"
👉 Tag: #10000coders and #Karunakar Pusuluri

This helps you build your learning portfolio and shows your enthusiasm to the world – and it also helps us recognize your effort!

👇Please find the code below.
Copy from here...
----------------------------------------------------
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>🛒 Fake Store API Demo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
            background: #f4f4f4;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        #products {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
            gap: 20px;
            margin-top: 30px;
        }

        .product {
            background: #fff;
            padding: 15px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            transition: transform 0.2s ease;
        }

        .product:hover {
            transform: scale(1.03);
        }

        .product img {
            width: 100%;
            height: 180px;
            object-fit: contain;
        }

        .title {
            font-weight: bold;
            font-size: 16px;
            margin: 10px 0;
        }

        .price {
            color: green;
            font-size: 18px;
        }
    </style>
</head>

<body>
    <h1>🛒 Product List (from Fake Store API)</h1>
    <div id="products">Loading products...</div>

    <script>
        // Step 1: Fetch data from the Fake Store API means we are making a request to server to get the products data
        fetch('https://fakestoreapi.com/products')
            .then(response => response.json()) // Convert to JSON -> means we are converting our raw json into plain objects
            .then(data => {
                const container = document.getElementById('products');
                container.innerHTML = ''; // Clear 'Loading...' text

                // Step 2: Loop through each product
                data.forEach(product => {
                    const productDiv = document.createElement('div');
                    productDiv.className = 'product';

                    // Step 3: Set inner HTML with product details
                    productDiv.innerHTML = `
            <img src="${product.image}" alt="${product.title}">
            <div class="title">${product.title}</div>
            <div class="price">₹ ${product.price}</div>
          `;
                    // Step 4: Add product to the container
                    container.appendChild(productDiv);
                });
            })
            .catch(error => {
                console.error('Error fetching data:', error);
                document.getElementById('products').innerHTML = "Something went wrong.";
            });
    </script>
</body>

</html>
--------------------------------------------------------

Thank you,
P Karunakar.

