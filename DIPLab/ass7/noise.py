import numpy as np
import cv2 as cv

def add_gaussian_noise(img, mean=0, sigma=50):
    h, w, c = img.shape
    
    # Generate noise with the same shape as that of the image
    gauss_noise = np.random.normal(mean, sigma, (h, w, c))
    
    # Add noise to the image
    noisy_img = np.clip(img + gauss_noise,0,255).astype(np.uint8)
    
    return noisy_img

# Read the input image
image = cv.imread("ass7/cat.jpg")

# Display the input image
cv.imshow("Input Image", image)

# Invoke the function to add Gaussian noise
noisy_image = add_gaussian_noise(image)

# Display the noisy image
cv.imshow("Noisy Image", noisy_image)

# Wait for any key press and close windows
cv.waitKey(0)
cv.destroyAllWindows()
