import cv2
import numpy as np
import matplotlib.pyplot as plt

def make_square(image, pad_value=(255, 255, 255)):
    height, width = image.shape[:2]
    size = max(height, width)
    
    # Calculate padding values
    top = (size - height) // 2
    bottom = size - height - top
    left = (size - width) // 2
    right = size - width - left
    
    # Create a square image with padding
    padded_image = np.full((size, size, 3), pad_value, dtype=np.uint8)
    padded_image[top:top+height, left:left+width, :] = image
    
    return padded_image

# Load the images using cv2
green_image = cv2.imread("ass5/greenapple.jpg")
red_image = cv2.imread("ass5/redapple.jpg")

# Make both images square with white padding
green_image_square = make_square(green_image)
red_image_square = make_square(red_image)

# Ensure both images are in the BGR color space
green_image_square = cv2.cvtColor(green_image_square, cv2.COLOR_BGR2RGB)
red_image_square = cv2.cvtColor(red_image_square, cv2.COLOR_BGR2RGB)

# Resize images to a common size
common_size = (612, 612)
green_image_resized = cv2.resize(green_image_square, common_size)
red_image_resized = cv2.resize(red_image_square, common_size)

# Perform image addition and clip the result to [0, 255]
result_image = np.clip(green_image_resized + red_image_resized, 0, 255).astype(np.uint8)

# Display the original images and the result
plt.figure(figsize=(15, 5))

plt.subplot(1, 3, 1)
plt.title("Green Apple")
plt.imshow(green_image_square)
plt.axis("off")

plt.subplot(1, 3, 2)
plt.title("Red Apple")
plt.imshow(red_image_square)
plt.axis("off")

plt.subplot(1, 3, 3)
plt.title("Image Addition")
plt.imshow(result_image)
plt.axis("off")

plt.tight_layout()
plt.show()
