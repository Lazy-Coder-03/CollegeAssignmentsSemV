import cv2
import numpy as np

def segment_image_manually(image_path, threshold_value):
    # Read the input image
    original_image = cv2.imread(image_path, cv2.IMREAD_GRAYSCALE)

    # Get the dimensions of the image
    height, width = original_image.shape

    # Create an empty matrix for the segmented image
    segmented_image = np.zeros((height, width), dtype=np.uint8)

    # Iterate through each pixel in the original image
    for i in range(height):
        for j in range(width):
            # Apply manual thresholding
            if original_image[i, j] > threshold_value:
                segmented_image[i, j] = 255
            else:
                segmented_image[i, j] = 0

    return segmented_image

# Specify the path to the input image
image_path = "ass10/cat.jpg"

# Specify the threshold value for manual segmentation (adjust as needed)
threshold_value = 127

# Perform manual image segmentation using the threshold method
segmented_result = segment_image_manually(image_path, threshold_value)

# Display the original and segmented images
cv2.imshow("Original Image", cv2.imread(image_path))
cv2.imshow("Segmented Image (Manual)", segmented_result)

cv2.waitKey(0)
# Close windows
cv2.destroyAllWindows()
