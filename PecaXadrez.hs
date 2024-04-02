module PecaXadrez where

data PecaXadrez = PecaXadrez {
    tipo :: String,
    cor :: String,
    posicaoLinha :: Int,
    posicaoColuna :: Int,
    posicao :: String
}

moverPeca :: PecaXadrez -> Int -> Int -> PecaXadrez
moverPeca peca novaLinha novaColuna =
    if verificarPossivelMoverPeca peca novaLinha novaColuna
        then peca { posicaoLinha = novaLinha, posicaoColuna = novaColuna, posicao = show novaLinha ++ "x" ++ show novaColuna }
        else peca

capturarPeca :: IO ()
capturarPeca = putStrLn "Peça capturada com sucesso!"

verificarPossivelMoverPeca :: PecaXadrez -> Int -> Int -> Bool
verificarPossivelMoverPeca peca novaLinha novaColuna =
    novaLinha <= 8 && novaColuna <= 8

informacoesPeca :: PecaXadrez -> IO ()
informacoesPeca peca = do
    putStrLn $ "Tipo: " ++ tipo peca
    putStrLn $ "Cor: " ++ cor peca
    putStrLn $ "Posição: " ++ posicao peca

main :: IO ()
main = do
    let peca = PecaXadrez {
        tipo = "Rei",
        cor = "Preto",
        posicaoLinha = 6,
        posicaoColuna = 5,
        posicao = "6x5"
    }
    informacoesPeca peca
    let pecaMudada = moverPeca peca 2 2
    informacoesPeca pecaMudada
    capturarPeca