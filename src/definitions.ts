export interface ProxyDetailsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
