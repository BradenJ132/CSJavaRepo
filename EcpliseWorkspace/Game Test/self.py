self.player = physicsentity(self, 'player', (50, 50,) (8, 15))
                        self.player.update((self.xmovement[1] - self.xmovement[0]))
                        self.player.render(self.screen)
