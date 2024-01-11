import cv2
import numpy as np

def apply_prewitt_operator(image):
    # Convert the image to grayscale if it's a colored image
    if len(image.shape) == 3:
        image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Get the dimensions of the image
    height, width = image.shape

    # Create empty matrices for horizontal and vertical gradients
    prewitt_x = np.zeros_like(image, dtype=np.float32)
    prewitt_y = np.zeros_like(image, dtype=np.float32)

    # Define Prewitt kernels for horizontal and vertical edges
    kernel_x = np.array([[-1, 0, 1], [-1, 0, 1], [-1, 0, 1]])
    kernel_y = np.array([[-1, -1, -1], [0, 0, 0], [1, 1, 1]])

    # Apply convolution using the Prewitt kernels
    for i in range(1, height - 1):
        for j in range(1, width - 1):
            prewitt_x[i, j] = np.sum(image[i-1:i+2, j-1:j+2] * kernel_x)
            prewitt_y[i, j] = np.sum(image[i-1:i+2, j-1:j+2] * kernel_y)

    # Calculate the gradient magnitude
    gradient_magnitude = np.sqrt(prewitt_x**2 + prewitt_y**2)

    # Normalize the gradient magnitude to the range [0, 255]
    gradient_magnitude_normalized = cv2.normalize(gradient_magnitude, None, 0, 255, cv2.NORM_MINMAX, dtype=cv2.CV_8U)

    return gradient_magnitude_normalized

# Read an image
image = cv2.imread("ass9/cat.jpg")


# Apply the Prewitt operator for edge detection
prewitt_edges = apply_prewitt_operator(image)

# Display the original and Prewitt edges side by side
cv2.imshow("Original Image", image)
cv2.imshow("Prewitt Edges", prewitt_edges)

# Wait for a key press and close windows
cv2.waitKey(0)
cv2.destroyAllWindows()
