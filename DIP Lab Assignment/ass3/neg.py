import cv2
import numpy as np

# Function to get negative image
def negative(image):
    h, w = image.shape[:2]
    # Creating a new matrix to store the negative image
    result = np.zeros_like(image, dtype=np.uint8)
    for i in range(h):
        for j in range(w):
            result[i, j] = 255 - image[i, j]
    return result

# Read the input image (assuming it is a grayscale image)
img = cv2.imread("ass3\cat.jpg", 0)

# Display the input image
cv2.imshow("Input Image", img)

# Display the negative image
cv2.imshow("Negative Image", negative(img))

# Wait for a key press and close windows
cv2.waitKey(0)
cv2.destroyAllWindows()
