#import pygame  
import pygame
#ininitializes pygame
pygame.init()
#creates window
screen = pygame.display.set_mode((1920, 1080))
#import the image/ converts it into a surface
frogimg = pygame.image.load("BlueFrog.jpg").convert()
#this is supposed to wokr but it deletes any color that is white 
frogimg.set_colorkey((255, 255, 255))

#this says when it is running x = 0 
#the clock is defining the tick rate/fps
#i will likely adjust with delta time later
running = True 
x = 0
clock = pygame.time.Clock()
# while the prgoma is running fill the window with black and place the surface/frog as that point
#also while it is running, move in the positive x direction 0.1 per tick 
while running:
    screen.fill((0, 0, 0))
    screen.blit(frogimg, (x, 20))

    x += 0.1
#this is saying when the event type/ x key i bielive it is, is pressed then quit the game/turn running to false
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False 

# this actually displays the surfaces on the screen
    pygame.display.flip()
# this defines the fps/tickrate
clock.tick(60) 
pygame.quit()