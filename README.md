# 未知しるべAndroid班開発合宿

## タスク管理について

### GitHub上のProjectで管理

- すべてのタスク：私が勝手にこんなもんかなって作ったissueが詰まっているところ
- Doing：今やっているタスク
- Review：Pull Request（レビュー待ち）のタスク
- Done：完了したタスク

まあ見ればわかる（雑）


## アーキテクチャな話

MVVMを導入してみようと思う！！

（たぶん大変だと思うから，急がなきゃ！ってなるより，ゆっくり見てみてほしい．

開発合宿で完璧にできなくて大丈夫だし，私も初めての試みだから！）


**参考サイト**
- [Android Architecture Components初級(MVVM + LiveData + Coroutines 編)](https://qiita.com/Tsutou/items/69a28ebbd69b69e51703)




## 開発ルール

### ブランチ名

- feature/hoge：機能やレイアウトなどを新しく追加した場合
- fix/hoge：機能やレイアウトなど、以前あったものを修正した場合

hogeの部分は機能やレイアウト内容を記入（英語のみ）

機能やレイアウト，画面名を入れるとわかりやすい



### ディレクトリ構造

- なんかね好みらしいよｗｗｗ



### コミットメッセージ

- feat:hoge : 新しい機能
- fix:hoge : 実はエラーが～みたいなのの修正
- docs:hoge : ドキュメントの変更（このREADMEとか）
- style:hoge : コードの意味に影響を与えないコーディングスタイルの変更（空白、フォーマットなど）や、xmlデザイン（レイアウト）の変更
- refactor:hoge : 構造の修正
- chore:hoge : ライブラリの追加・変更、リソースの追加

hoge部分には機能やレイアウト内容を簡潔に記入(日本語でも可)

### Pull Request
- プルリクエストとは、コードの変更をレビュワーに通知し、マージを依頼する機能です。
コードのレビューを受けることで、1人で作ると気がつかないコードの指摘やバグや記述ミスの発見ができ、コードの品質を高めます。

- [テンプレ](https://github.com/miraikeitai2020/android-summer-vacation/blob/develop/.github/PULL_REQUEST_TEMPLATE.md)に沿って入力する

### その他

- [今日作る簡易的未知しるべ](https://docs.google.com/document/d/1NHJhyaLDur_Pp6CND7iHujCYrK9PdcCAaejTFPRQHY0/edit?usp=sharing)
- [今日作る未知しるべのモック画像まとめ](https://drive.google.com/drive/folders/1GM6OeOFGc6ptSkiZLnIbSTmM0LaGiXzg)
