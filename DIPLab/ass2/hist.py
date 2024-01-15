import numpy as np
import cv2 as cv
import matplotlib.pyplot as plt
#function to form
def form_histogram(img):
    h,w=img.shape
    histogram=np.zeros([256],dtype=np.uint8)
    #calculate histogram
    for i in range(h):
        for j in range(w):
            frequency=img[i,j]
            histogram[frequency]+=1
    return histogram
#read the input image
image=cv.imread("ass2/cat.jpg",0)
#display the input image
cv.imshow("Input Image",image)
#calculate histogram
h=form_histogram(image)
#display the histogram
plt.bar(np.arange(len(h)),h)
plt.show()
#wait for key press and close windows
cv.waitKey(0)
cv.destroyAllWindows()