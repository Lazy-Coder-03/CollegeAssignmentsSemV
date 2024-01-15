import numpy as np
import cv2 as cv
# Read the input image
img = cv.imread("ass1/cat.jpg", 1)
# Display the original image
cv.imshow("Input image", img)
# Get the height, width, and number of channels of the image
h, w, c = img.shape
# Create an empty image with the dimensions swapped for clockwise rotation
result = np.zeros([w, h, c], dtype=np.uint8)
# Rotate the image clockwise
for i in range(h):
    for j in range(w):
        result[j, h-1-i] = img[i, j]
# Display the rotated image
cv.imshow("Output image", result)
# Wait for a key press and close all OpenCV windows
cv.waitKey(0)
cv.destroyAllWindows()
