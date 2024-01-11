import numpy as np
import cv2 as cv

def intensity_suppression(img, factor):
    # Get the height and width of the image
    h, w = img.shape
    
    # Create an empty matrix for the result with the same size as the input image
    result = np.zeros_like(img, dtype=np.uint8)
    
    # Iterate through each pixel in the image
    for i in range(h):
        for j in range(w):
            # Apply suppression by subtracting the specified factor from the pixel intensity
            result[i, j] = max(0, img[i, j] - factor)
    
    return result

# Read the input grayscale image
image = cv.imread("ass6/cat.jpg", cv.IMREAD_GRAYSCALE)

# Display the original image
cv.imshow("Input Image", image)

# Apply intensity suppression with a specified factor (85 in this case)
suppressed_image = intensity_suppression(image, 85)

# Display the output image after intensity suppression
cv.imshow("Output Image", suppressed_image)

# Wait for a key press and close windows
cv.waitKey(0)
cv.destroyAllWindows()
