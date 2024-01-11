import cv2
import numpy as np

def apply_mean_filter(image, kernel_size):
    height, width, channels = image.shape
    result_image = np.zeros_like(image)

    for i in range(height):
        for j in range(width):
            for k in range(channels):
                # Calculate mean for each channel within the kernel
                start_i, start_j = max(0, i - kernel_size // 2), max(0, j - kernel_size // 2)
                end_i, end_j = min(height - 1, i + kernel_size // 2), min(width - 1, j + kernel_size // 2)

                # Calculate mean value
                mean_value = np.mean(image[start_i:end_i + 1, start_j:end_j + 1, k])
                result_image[i, j, k] = int(mean_value)

    return result_image

# Read an image
image = cv2.imread("ass8/cat.jpg")

# Display the original image
cv2.imshow("Original Image", image)

# Specify the kernel size for the mean filter
kernel_size = 5

# Apply the mean filter
filtered_image = apply_mean_filter(image, kernel_size)

# Display the mean-filtered image
cv2.imshow(f"Mean Filtered Image (Kernel Size = {kernel_size})", filtered_image)

cv2.waitKey(0)
# Close windows
cv2.destroyAllWindows()
