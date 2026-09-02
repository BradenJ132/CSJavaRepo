import pygame

#working directory - C:\Users\super\AppData\Local\Programs\Microsoft VS Code
pygame.init()
screen = pygame.display.set_mode((1920, 1080))

frogimg = pygame.image.load("BlueFrog.jpg").convert()
frogimg.set_colorkey((255, 255, 255))

running = True 
x = 0
clock = pygame.time.Clock()

while running:
    screen.fill((0, 0, 0))
    screen.blit(frogimg, (x, 20))

    x += 0.1

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False 


    pygame.display.flip()

clock.tick(60) 
pygame.quit()