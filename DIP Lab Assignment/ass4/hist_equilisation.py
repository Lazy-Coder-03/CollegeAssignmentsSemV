import cv2
import numpy as np
import matplotlib.pyplot as plt  # Import Matplotlib library

def compute_histogram(image):
    histogram = np.zeros(256, dtype=int)
    h, w = image.shape[:2]
    for i in range(h):
        for j in range(w):
            intensity = image[i, j]
            histogram[intensity] += 1

    return histogram

def histogram_equalization(image):
    h, w = image.shape[:2]
    total_pixels = h * w

    hist = compute_histogram(image)

    # Compute cumulative distribution function (CDF) manually
    cdf = np.zeros(256, dtype=int)
    cdf[0] = hist[0]
    for i in range(1, 256):
        cdf[i] = cdf[i - 1] + hist[i]

    cdf_normalized = cdf * 255 / total_pixels

    equalized_image = np.zeros_like(image, dtype=np.uint8)

    for i in range(h):
        for j in range(w):
            equalized_image[i, j] = cdf_normalized[image[i, j]]

    return equalized_image

img = cv2.imread("ass4/cat.jpg", cv2.IMREAD_GRAYSCALE)

# Compute histograms before and after equalization
hist_before = compute_histogram(img)
equalized_img = histogram_equalization(img)
hist_after = compute_histogram(equalized_img)

# Plotting histograms using bar plots
plt.figure(figsize=(12, 6))

plt.subplot(2, 2, 1)
plt.title("Original Image")
plt.imshow(img, cmap="gray")
plt.axis("off")

plt.subplot(2, 2, 2)
plt.title("Histogram Before Equalization")
plt.bar(range(256), hist_before, color="black",width=1)
plt.xlabel("Pixel Value")
plt.ylabel("Frequency")

plt.subplot(2, 2, 3)
plt.title("Enhanced Image")
plt.imshow(equalized_img, cmap="gray")
plt.axis("off")

plt.subplot(2, 2, 4)
plt.title("Histogram After Equalization")
plt.bar(range(256), hist_after, color="black",width=1)
plt.xlabel("Pixel Value")
plt.ylabel("Frequency")

plt.tight_layout()
plt.show()

cv2.waitKey(0)
cv2.destroyAllWindows()
