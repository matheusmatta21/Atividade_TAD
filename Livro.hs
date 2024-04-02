module Livro where

data Livro = Livro {
    titulo :: String,
    autor :: String,
    anoPublicacao :: Int,
    copiasDisponiveis :: Int
}

emprestarCopia :: Livro -> Livro
emprestarCopia livro =
    if existeCopia livro
        then livro { copiasDisponiveis = copiasDisponiveis livro - 1 }
        else livro

devolverCopia :: Livro -> Livro
devolverCopia livro = livro { copiasDisponiveis = copiasDisponiveis livro + 1 }

existeCopia :: Livro -> Bool
existeCopia livro = copiasDisponiveis livro > 0

informacoesLivro :: Livro -> IO ()
informacoesLivro livro = do
    putStrLn $ "Titulo: " ++ titulo livro
    putStrLn $ "Autor: " ++ autor livro
    putStrLn $ "Ano de Publicação: " ++ show (anoPublicacao livro)
    putStrLn $ "Cópias disponíveis: " ++ show (copiasDisponiveis livro)

main :: IO ()
main = do
    let livro = Livro {
        titulo = "Naruto",
        autor = "Masashi Kishimoto",
        anoPublicacao = 1999,
        copiasDisponiveis = 0
    }
    let livroEmprestado = emprestarCopia livro
    informacoesLivro livroEmprestado
    let livroDevolvido = devolverCopia livroEmprestado
    informacoesLivro livroDevolvido